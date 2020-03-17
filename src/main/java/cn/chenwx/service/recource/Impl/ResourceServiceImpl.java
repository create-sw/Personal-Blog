package cn.chenwx.service.recource.Impl;


import cn.chenwx.mapper.ResourceMapper;
import cn.chenwx.model.Resource;
import cn.chenwx.service.recource.ResourceService;
import cn.chenwx.utils.BlogJSONResult;
import cn.chenwx.utils.DateKit;
import cn.chenwx.utils.StringUtil;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ApeNixX
 * @Date 2020/2/8 15:52
 * @Version 1.0
 * @Describe 资源业务实现
 */
@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public List<Resource> getAllResourceByType(String resourceTypeName, int pageNum, int rows) {
        PageHelper.startPage(pageNum,rows);
        if(StringUtil.BLANK.equals(resourceTypeName)){
          return resourceMapper.getAllResource1();
        }else {
          return resourceMapper.getAllResourceByType(resourceTypeName);
        }
    }

    @Override
    public BlogJSONResult insertResource(Resource resource) {
        DateKit timeUtil = new DateKit();
        resource.setCreateTime(timeUtil.getFormatDateForFive());
        resourceMapper.save(resource);
        return BlogJSONResult.ok();
    }

    @Override
    public BlogJSONResult updateResource(Resource resource, int id) {
        int i =resourceMapper.updateResource(resource,id);
        if(i==0){
            return BlogJSONResult.errorException("更新异常");
        }else {
            return BlogJSONResult.ok();
        }
    }

    @Override
    public BlogJSONResult changeReourceStatus(int status, int id) {

        int i = resourceMapper.updateResourceStatus(status,id);
        if(i==0){
            return BlogJSONResult.errorException("更新异常");
        }else {
            return BlogJSONResult.ok();
        }
    }

    @Override
    public List<Resource> getResourceList(int pageNum, int rows) {
        PageHelper.startPage(pageNum,rows);
        return resourceMapper.getAllResource();
    }
}
