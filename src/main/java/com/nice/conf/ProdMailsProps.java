package com.nice.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Evegeny on 12/07/2017.
 */
@ConfigurationProperties(prefix = "nice.notification")
@Data
public class ProdMailsProps {
    private List<String> mails;
    private boolean enabled;
}
