package com.how2java.springboot.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.how2java.springboot.pojo.Result;
import com.how2java.springboot.pojo.userbill;
import com.how2java.springboot.service.UserBillService;

@Controller
public class UploadController {
	@Autowired
	private UserBillService userBillService;
	
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public Result<String> upload(HttpServletRequest req, @RequestParam("file") MultipartFile file,Model m,HttpSession session) {
    	Result<String> result=new Result<>();   
    	try {
            	
            	String fileName = file.getOriginalFilename();
            	String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
				String destFileName=req.getServletContext().getRealPath("")+"static"+File.separator+"images"+File.separator;
				fileName = UUID.randomUUID() + suffixName; // 新文件名
				/*修改头像*/
				userbill userbill=(userbill) session.getAttribute("user");
				userbill.setTxurl(fileName);
				this.updatetx(userbill);
				File destFile = new File(destFileName+fileName);
				
				if (!destFile.getParentFile().exists()) {
					destFile.getParentFile().mkdirs();
		        }
				
            	file.transferTo(destFile);
            
            	List<String> list= new ArrayList<>();
            	list.add(0, fileName);
            	
            	result.setCode(1);
            	result.setData(list);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                result.setCode(0);
                return result;
            } catch (IOException e) {
                e.printStackTrace();
                result.setCode(0);
                return result;
            }
             
            return result;
    }  
    
    /*修改头像*/
    public int updatetx(userbill userbill){
    	return this.userBillService.updatetx(userbill);
    }
}
