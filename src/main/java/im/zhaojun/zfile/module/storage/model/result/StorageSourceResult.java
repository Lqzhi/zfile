package im.zhaojun.zfile.module.storage.model.result;

import im.zhaojun.zfile.module.storage.model.enums.StorageTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 存储源基本信息结果类
 *
 * @author zhaojun
 */
@Data
@Schema(description = "存储源基本信息响应类")
public class StorageSourceResult implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "存储源名称", example = "阿里云 OSS 存储")
    private String name;

    @Schema(name = "存储源别名", example = "存储源别名，用于 URL 中展示, 如 http://ip:port/{存储源别名}")
    private String key;

    @Schema(name = "存储源类型")
    private StorageTypeEnum type;

    @Schema(name = "是否开启搜索", example = "true")
    private Boolean searchEnable;

    @Schema(name = "是否默认开启图片模式", example = "true")
    private Boolean defaultSwitchToImgMode;

}