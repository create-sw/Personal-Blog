package cn.chenwx.model;

import lombok.Data;

/**
 * @Author ApeNixX
 * @Date 2020/2/8 15:26
 * @Version 1.0
 * @Describe
 */
@Data
public class Resource {
    private int id;
    private String resourceName;
    private String resourceUserName;
    private String resourcePath;
    private String createTime;
    private String imgSrc;
    private String resourceDescribe;
    private String resourceTypeName;
    private int status=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceUserName() {
        return resourceUserName;
    }

    public void setResourceUserName(String resourceUserName) {
        this.resourceUserName = resourceUserName;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getResourceDescribe() {
        return resourceDescribe;
    }

    public void setResourceDescribe(String resourceDescribe) {
        this.resourceDescribe = resourceDescribe;
    }

    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
