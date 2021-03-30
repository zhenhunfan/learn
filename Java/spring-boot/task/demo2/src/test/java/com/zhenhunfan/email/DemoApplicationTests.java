package com.zhenhunfan.email;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    JavaMailSender javaMailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("zhang88hong34@126.com");
        message.setFrom("564090302@qq.com");
        message.setSubject("测试第三方发送邮件");
        message.setText("这是邮件内容");
        javaMailSender.send(message);
    }

    @Test
    void test02() throws Exception{
        MimeMessage message =  javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,true);

        helper.setTo("zhang88hong34@126.com");
        helper.setFrom("564090302@qq.com");
        helper.setSubject("测试第三方发送邮件");
        helper.setText("<h1 style='color:red'>这是邮件内容</h1>",true);
        helper.addAttachment("附件1.doc",new File("C:\\Users\\admin\\Desktop\\各种格式文件\\测试用word文档.doc"));
        javaMailSender.send(message);
    }

}
