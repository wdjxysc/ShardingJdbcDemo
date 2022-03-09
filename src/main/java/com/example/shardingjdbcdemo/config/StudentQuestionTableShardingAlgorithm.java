package com.example.shardingjdbcdemo.config;

import com.example.shardingjdbcdemo.common.SpringContextUtil;
import com.example.shardingjdbcdemo.web.mapper.StudentQuestionMapper;
import com.example.shardingjdbcdemo.web.service.StudentQuestionService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @ClassName ShardingJdbcConfig
 * @Description TODO
 * @Author Administrator
 * @Date 2022/2/24 11:19
 **/
public class StudentQuestionTableShardingAlgorithm implements PreciseShardingAlgorithm<String> {

//    public static StudentQuestionMapper studentQuestionMapper = SpringContextUtil.getBean(StudentQuestionMapper.class);
//    @Resource
//    private StudentQuestionService studentQuestionService;

    /**
     * 分库算法
     */
//    static class DatabaseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
//        @Override
//        public String doSharding(Collection<String> databaseNames, PreciseShardingValue<Long> shardingValue) {
//
//            for (String database : databaseNames) {
//                if (database.endsWith(String.valueOf(shardingValue.getValue() % 2))) {
//                    return database;
//                }
//            }
//            return "";
//        }
//    }

    /**
     * 分表算法
     */
    @Override
    public String doSharding(Collection<String> tableNames, PreciseShardingValue<String> shardingValue) {
        String suffix = "_2022_03";
//        if(StringUtils.hasText(suffix)){
//            for (String table : tableNames) {
//                if (table.endsWith(suffix)) {
//                    return table;
//                }
//            }
//        }
//
//
//        return "";
//        final String suffix1 = studentQuestionService.selectTableSuffix(shardingValue.getValue());
        StringBuffer tableName = new StringBuffer();
        tableName.append(shardingValue.getLogicTableName()).append(suffix);

        return tableName.toString();
    }
}
