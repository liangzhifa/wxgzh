package com.zhifa.wxgzh.aliyun;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class AliyunImageResult {

    /**
     * log_id : 7166999925980082868
     * words_result : [{"probability":{"average":0.870908,"min":0.708589,"variance":0.01443},"words":"Baidu言销"}]
     * words_result_num : 1
     * language : -1
     * direction : 0
     */

    private long log_id;
    private int words_result_num;
    private int language;
    private int direction;
    private List<WordsResultBean> words_result;

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public int getWords_result_num() {
        return words_result_num;
    }

    public void setWords_result_num(int words_result_num) {
        this.words_result_num = words_result_num;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public List<WordsResultBean> getWords_result() {
        return words_result;
    }

    public void setWords_result(List<WordsResultBean> words_result) {
        this.words_result = words_result;
    }

    @Data
    @ToString
    public static class WordsResultBean {
        /**
         * probability : {"average":0.870908,"min":0.708589,"variance":0.01443}
         * words : Baidu言销
         */

        private ProbabilityBean probability;
        private String words;

        public ProbabilityBean getProbability() {
            return probability;
        }

        public void setProbability(ProbabilityBean probability) {
            this.probability = probability;
        }

        public String getWords() {
            return words;
        }

        public void setWords(String words) {
            this.words = words;
        }

        public static class ProbabilityBean {
            /**
             * average : 0.870908
             * min : 0.708589
             * variance : 0.01443
             */

            private double average;
            private double min;
            private double variance;

            public double getAverage() {
                return average;
            }

            public void setAverage(double average) {
                this.average = average;
            }

            public double getMin() {
                return min;
            }

            public void setMin(double min) {
                this.min = min;
            }

            public double getVariance() {
                return variance;
            }

            public void setVariance(double variance) {
                this.variance = variance;
            }
        }
    }
}
