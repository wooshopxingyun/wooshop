
package com.wooshop.modules.wechat_reply.service;


import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.io.IOException;
import com.wooshop.modules.wechat_reply.service.dto.WooshopWechatReplyDto;
import org.springframework.data.domain.Pageable;
import com.wooshop.modules.service.BaseService;

import com.wooshop.domain.PageResult;
import com.wooshop.modules.wechat_reply.domain.WooshopWechatReply;

import com.wooshop.modules.wechat_reply.service.dto.WooshopWechatReplyQueryCriteria;

/**
* @author woo
* @date 2022-02-23
* 注意：
* 本软件为www.wooshop.com开发研制，未经购买不得使用
* 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
* 一经发现盗用、分享等行为，将追究法律责任，后果自负
*/


public interface WooshopWechatReplyService  extends BaseService<WooshopWechatReply>{

    /**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    PageResult<WooshopWechatReplyDto>  queryAll(WooshopWechatReplyQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<WooshopWechatReplyDto>
    */
    List<WooshopWechatReply> queryAll(WooshopWechatReplyQueryCriteria criteria);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<WooshopWechatReplyDto> all, HttpServletResponse response) throws IOException;

    /**
    * 包含新增和更新功能
    * @param resources
    * @return
    */
    PageResult<WooshopWechatReplyDto> addAndUpdate(WooshopWechatReply resources);


    /**
    * 根据id 进行删除
    * @param id
    */
    void cacheRemoveById(Long id);

    /**
     * 查询类型
     * @param key
     * @return
     */
    WooshopWechatReply queryKey(String key);
}
