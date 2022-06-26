package org.openea.oss.config;

import org.openea.oss.properties.FileServerProperties;
import org.openea.oss.template.FdfsTemplate;
import org.openea.oss.template.S3Template;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;


@EnableConfigurationProperties(FileServerProperties.class)
@Import({FdfsTemplate.class, S3Template.class})
public class OssAutoConfigure {

}
