
package com.wooshop.modules.goods.service;


import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.io.IOException;
import com.wooshop.modules.goods.service.dto.WooshopStoreGoodsDto;
import org.springframework.data.domain.Pageable;
import com.wooshop.modules.service.BaseService;

import com.wooshop.domain.PageResult;
import com.wooshop.modules.goods.domain.WooshopStoreGoods;

import com.wooshop.modules.goods.service.dto.WooshopStoreGoodsQueryCriteria;

/**
* @author woo
* @date 2021-11-30
* 注意：
* 本软件为www.wooshopxingyun.com开发研制，未经购买不得使用
* 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
* 一经发现盗用、分享等行为，将追究法律责任，后果自负
*/


public interface WooshopStoreGoodsService  extends BaseService<WooshopStoreGoods>{

    /**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    PageResult<WooshopStoreGoodsDto>  queryAll(WooshopStoreGoodsQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<WooshopStoreGoodsDto>
    */
    List<WooshopStoreGoods> queryAll(WooshopStoreGoodsQueryCriteria criteria);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<WooshopStoreGoodsDto> all, HttpServletResponse response) throws IOException;


    /**
     * 物理删除
     * @param goods
     * @param activityType 普通商品 0
     */
    void delByGoodsId(WooshopStoreGoods goods,Integer activityType);

    /**
     * 通过 id查询商品信息
     * @param id
     * @return
     */
    WooshopStoreGoodsDto qeuryByIdInfo(Long id);

}
