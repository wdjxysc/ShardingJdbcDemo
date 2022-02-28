package com.example.shardingjdbcdemo.config;

import com.example.shardingjdbcdemo.common.SpringContextUtil;
import com.example.shardingjdbcdemo.web.mapper.StudentQuestionMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @ClassName ShardingJdbcConfig
 * @Description TODO
 * @Author Administrator
 * @Date 2022/2/24 11:19
 **/
@Slf4j
public class StudentQuestionShardingAlgorithm {
//    public static final DatabaseShardingAlgorithm databaseShardingAlgorithm = new DatabaseShardingAlgorithm();
    public static final TableShardingAlgorithm tableShardingAlgorithm = new TableShardingAlgorithm();

    public static StudentQuestionMapper studentQuestionMapper = SpringContextUtil.getBean(StudentQuestionMapper.class);

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
    static class TableShardingAlgorithm implements PreciseShardingAlgorithm<String> {
        @Override
        public String doSharding(Collection<String> tableNames, PreciseShardingValue<String> shardingValue) {
            final String suffix = studentQuestionMapper.selectCreateTime(shardingValue.getValue());
            for (String table : tableNames) {
                if (table.endsWith(suffix)) {
                    return table;
                }
            }
            return "";
        }
    }
}
