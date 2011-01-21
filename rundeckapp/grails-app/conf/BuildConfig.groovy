grails.project.dependency.resolution = {
    inherits "global" // inherit Grails' default dependencies
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        //include snakeyaml from deps dir
        flatDir name:'sourceDeps', dirs:'../dependencies/snakeyaml/jars'
        grailsHome()
        mavenCentral()
    }
    dependencies {
        build 'org.apache.ant:ant:1.8.1','org.apache.ant:ant-antlr:1.8.1','org.apache.ant:ant-apache-bcel:1.8.1','org.apache.ant:ant-apache-log4j:1.8.1','org.apache.ant:ant-apache-oro:1.8.1','org.apache.ant:ant-apache-regexp:1.8.1','org.apache.ant:ant-apache-resolver:1.8.1','org.apache.ant:ant-commons-logging:1.8.1','org.apache.ant:ant-commons-net:1.8.1','org.apache.ant:ant-jai:1.8.1','org.apache.ant:ant-javamail:1.8.1','org.apache.ant:ant-jdepend:1.8.1','org.apache.ant:ant-jmf:1.8.1','org.apache.ant:ant-jsch:1.8.1','org.apache.ant:ant-junit:1.8.1','org.apache.ant:ant-launcher:1.8.1','org.apache.ant:ant-netrexx:1.8.1','org.apache.ant:ant-nodeps:1.8.1','org.apache.ant:ant-swing:1.8.1','org.apache.ant:ant-testutil:1.8.1','commons-logging:commons-logging:1.1','commons-logging:commons-logging-api:1.1'
        compile 'org.apache.ant:ant:1.8.1','org.apache.ant:ant-antlr:1.8.1','org.apache.ant:ant-apache-bcel:1.8.1','org.apache.ant:ant-apache-log4j:1.8.1','org.apache.ant:ant-apache-oro:1.8.1','org.apache.ant:ant-apache-regexp:1.8.1','org.apache.ant:ant-apache-resolver:1.8.1','org.apache.ant:ant-commons-logging:1.8.1','org.apache.ant:ant-commons-net:1.8.1','org.apache.ant:ant-jai:1.8.1','org.apache.ant:ant-javamail:1.8.1','org.apache.ant:ant-jdepend:1.8.1','org.apache.ant:ant-jmf:1.8.1','org.apache.ant:ant-jsch:1.8.1','org.apache.ant:ant-junit:1.8.1','org.apache.ant:ant-launcher:1.8.1','org.apache.ant:ant-netrexx:1.8.1','org.apache.ant:ant-nodeps:1.8.1','org.apache.ant:ant-swing:1.8.1','org.apache.ant:ant-testutil:1.8.1','commons-logging:commons-logging:1.1','commons-logging:commons-logging-api:1.1'
        test 'org.yaml:snakeyaml:1.7','org.apache.ant:ant:1.8.1','org.apache.ant:ant-antlr:1.8.1','org.apache.ant:ant-apache-bcel:1.8.1','org.apache.ant:ant-apache-log4j:1.8.1','org.apache.ant:ant-apache-oro:1.8.1','org.apache.ant:ant-apache-regexp:1.8.1','org.apache.ant:ant-apache-resolver:1.8.1','org.apache.ant:ant-commons-logging:1.8.1','org.apache.ant:ant-commons-net:1.8.1','org.apache.ant:ant-jai:1.8.1','org.apache.ant:ant-javamail:1.8.1','org.apache.ant:ant-jdepend:1.8.1','org.apache.ant:ant-jmf:1.8.1','org.apache.ant:ant-jsch:1.8.1','org.apache.ant:ant-junit:1.8.1','org.apache.ant:ant-launcher:1.8.1','org.apache.ant:ant-netrexx:1.8.1','org.apache.ant:ant-nodeps:1.8.1','org.apache.ant:ant-swing:1.8.1','org.apache.ant:ant-testutil:1.8.1','commons-logging:commons-logging:1.1','commons-logging:commons-logging-api:1.1'
        runtime 'org.yaml:snakeyaml:1.7','org.apache.ant:ant:1.8.1','org.apache.ant:ant-antlr:1.8.1','org.apache.ant:ant-apache-bcel:1.8.1','org.apache.ant:ant-apache-log4j:1.8.1','org.apache.ant:ant-apache-oro:1.8.1','org.apache.ant:ant-apache-regexp:1.8.1','org.apache.ant:ant-apache-resolver:1.8.1','org.apache.ant:ant-commons-logging:1.8.1','org.apache.ant:ant-commons-net:1.8.1','org.apache.ant:ant-jai:1.8.1','org.apache.ant:ant-javamail:1.8.1','org.apache.ant:ant-jdepend:1.8.1','org.apache.ant:ant-jmf:1.8.1','org.apache.ant:ant-jsch:1.8.1','org.apache.ant:ant-junit:1.8.1','org.apache.ant:ant-launcher:1.8.1','org.apache.ant:ant-netrexx:1.8.1','org.apache.ant:ant-nodeps:1.8.1','org.apache.ant:ant-swing:1.8.1','org.apache.ant:ant-testutil:1.8.1','org.springframework:org.springframework.test:3.0.0.RELEASE','commons-logging:commons-logging:1.1','commons-logging:commons-logging-api:1.1'
    }
    grails.plugin.location.'webrealms' = "webrealms"
}
