package com.pp.test;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class GenSn {
    private static final Logger logger = LoggerFactory.getLogger(GenSn.class);

    public static void main(String[] args) {
        genSn(1);
    }


    private static String genSn(Integer promotionId) {
        Integer radix = 32;
        Calendar c = Calendar.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(c.get(Calendar.MONTH) + 1, radix));
        logger.info("sb:{}", sb);

        sb.append(Integer.toString(c.get(Calendar.DAY_OF_MONTH), radix));
        logger.info("sb:{}", sb);

        sb.append(StringUtils.leftPad(Integer.toString(promotionId % (int) Math.pow(radix, 3), radix), 3, "0"));
        logger.info("sb:{}", sb);

        sb.append(SimpleSequenceGenerator.getRandomSeq());
        logger.info("sb:{}", sb);

        String tmp = sb.toString().toUpperCase();
        logger.info("sb:{}", sb);
        return tmp.replaceAll("O", "X").replaceAll("I", "Y");
    }
}
