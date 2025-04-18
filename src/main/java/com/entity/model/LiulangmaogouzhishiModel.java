package com.entity.model;

import com.entity.LiulangmaogouzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 信息发布
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-04 23:10:31
 */
public class LiulangmaogouzhishiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 发布类型
	 */
	
	private String zhishileixing;
		
	/**
	 * 宠物图片
	 */
	
	private String chongwutupian;
		
	/**
	 * 发布人
	 */
	
	private String xingtaitezheng;
		
	/**
	 * 信息时效
	 */
	
	private String shenghuoxixing;
		
	/**
	 * 审核人
	 */
	
	private String xunyangfangfa;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 知识内容
	 */
	
	private String zhishineirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：发布类型
	 */
	 
	public void setZhishileixing(String zhishileixing) {
		this.zhishileixing = zhishileixing;
	}
	
	/**
	 * 获取：发布类型
	 */
	public String getZhishileixing() {
		return zhishileixing;
	}
				
	
	/**
	 * 设置：宠物图片
	 */
	 
	public void setChongwutupian(String chongwutupian) {
		this.chongwutupian = chongwutupian;
	}
	
	/**
	 * 获取：宠物图片
	 */
	public String getChongwutupian() {
		return chongwutupian;
	}
				
	
	/**
	 * 设置：发布人
	 */
	 
	public void setXingtaitezheng(String xingtaitezheng) {
		this.xingtaitezheng = xingtaitezheng;
	}
	
	/**
	 * 获取：发布人
	 */
	public String getXingtaitezheng() {
		return xingtaitezheng;
	}
				
	
	/**
	 * 设置：信息时效
	 */
	 
	public void setShenghuoxixing(String shenghuoxixing) {
		this.shenghuoxixing = shenghuoxixing;
	}
	
	/**
	 * 获取：信息时效
	 */
	public String getShenghuoxixing() {
		return shenghuoxixing;
	}
				
	
	/**
	 * 设置：审核人
	 */
	 
	public void setXunyangfangfa(String xunyangfangfa) {
		this.xunyangfangfa = xunyangfangfa;
	}
	
	/**
	 * 获取：审核人
	 */
	public String getXunyangfangfa() {
		return xunyangfangfa;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：知识内容
	 */
	 
	public void setZhishineirong(String zhishineirong) {
		this.zhishineirong = zhishineirong;
	}
	
	/**
	 * 获取：知识内容
	 */
	public String getZhishineirong() {
		return zhishineirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
