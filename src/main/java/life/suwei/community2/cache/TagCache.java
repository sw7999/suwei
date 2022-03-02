package life.suwei.community2.cache;

import life.suwei.community2.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shkstart
 * @date 2022/3/1-22:24
 */
public class TagCache {
    public static List<TagDTO> get(){
        List<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO program = new TagDTO();
        program.setCategoryName("峡谷匹配");
        program.setTags(Arrays.asList("上单","中单","打野","AD","辅助",
                "赛事讨论","开黑交友","开发者","撸圈八卦"));
        tagDTOS.add(program);

        TagDTO framework = new TagDTO();
        framework.setCategoryName("云顶之奕");
        framework.setTags(Arrays.asList("大神阵容","新人入队","亚洲杯"));
        tagDTOS.add(framework);
        return tagDTOS;
    }

    public static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();

        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> StringUtils.isBlank(t) || !tagList.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }

    public static void main(String[] args) {
        int i = (5 - 1) >>> 1;
        System.out.println(i);
    }
}
