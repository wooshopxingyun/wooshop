

package com.wooshop.modules.user_level.service.dto;

import com.wooshop.common.Query;
import lombok.Data;


/**
* @author woo
* @date 2022-04-16
* 注意：
* 本软件为www.wooshop.com开发研制，未经购买不得使用
* 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
* 一经发现盗用、分享等行为，将追究法律责任，后果自负
*/


@Data
public class WooshopUserLevelQueryCriteria{

    /** 精确 */
    @Query
    private Long id;

    /** 精确 */
    @Query
    private Long uid;

    /** 精确 */
    @Query
    private Integer levelId;

    /** 精确 */
    @Query
    private Integer grade;

    /** 精确 */
    @Query
    private Integer discount;
}