package com.huang.entity;

/**
 * 
 * @author huang
 */
public class Tblscore {
	/**
	 *  
	 */
	private String stuId;
	/**
	 *  
	 */
	private String courseId;
	/**
	 *  
	 */
	private Float score;
	/**
	 * 
	 * @param stuId
	 */
	public void setStuId(String stuId){
		this.stuId = stuId;
	}
	
    /**
     * 
     * @return
     */	
    public String getStuId(){
    	return stuId;
    }
	/**
	 * 
	 * @param courseId
	 */
	public void setCourseId(String courseId){
		this.courseId = courseId;
	}
	
    /**
     * 
     * @return
     */	
    public String getCourseId(){
    	return courseId;
    }
	/**
	 * 
	 * @param score
	 */
	public void setScore(Float score){
		this.score = score;
	}
	
    /**
     * 
     * @return
     */	
    public Float getScore(){
    	return score;
    }
}