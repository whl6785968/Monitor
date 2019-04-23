package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import service.UserService;
import util.FastDFSClient;
import util.JsonUtils;
import util.UploadPictureUtil;

@Controller
public class UpPicController {
	@Value("${IMAGE_SERVER_URL}")
	private String IMAGE_SERVER_URL;
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/uploadFileMuser")
	public String uploadPicture(@RequestParam("file") CommonsMultipartFile file,@RequestParam String id) throws Exception
	{
		String originalFilename = file.getOriginalFilename();
		String extName = originalFilename.substring(originalFilename.indexOf(".")+1);
		FastDFSClient fastDFSClient = new FastDFSClient("classpath:resources/client.conf");
		String path = fastDFSClient.uploadFile(file.getBytes(),extName);
		String url = IMAGE_SERVER_URL + path;
		System.out.println(url);
		HashMap<Object, Object> map1 = new HashMap<>();
		HashMap<Object, Object> map2 = new HashMap<>();
		/*
		 * layui上传需要参数:
		 * 1.code:0
		 * 2.msg:信息
		 * 3.data:map类型的数据
		 * 4.map需要的参数
		 * 	4.1 src:url 图片url
		 *  4.2 title:extName 图片名称
		 *  
		 * 返回类型
		 * json格式的result
		 * 
		 * */
		map1.put("code",0);
		map1.put("msg","上传成功");
		map2.put("path", url);
		map2.put("id",id);
		map2.put("src", url);
		map1.put("data",map2);
		int userid = Integer.parseInt(id);
		userService.updateImage(userid, url);
		map2.put("title", extName);
		String result = JsonUtils.objectToJson(map1);
		return result;
	}
	
	@ResponseBody
	@RequestMapping("/localUpload")
	public Object uploadIcon(HttpServletRequest request, MultipartFile file,@RequestParam String id) throws IOException {
        String path= UploadPictureUtil.addMutiparFile(file,request.getSession().getServletContext().getRealPath("/"));
        Map result=new HashMap();
        result.put("path",path);
        result.put("id", id);
        //保存图片链接到数据库
        userService.updateImage(Integer.valueOf(id), path);;
        return  result;

    }
}
