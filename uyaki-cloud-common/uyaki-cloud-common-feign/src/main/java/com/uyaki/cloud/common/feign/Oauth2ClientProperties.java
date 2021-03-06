package com.uyaki.cloud.common.feign;

import lombok.Data;

/**
 * @author uyaki
 * @date 2019-08-01 16:44
 */
@Data
public class Oauth2ClientProperties {
    private String id;
    private String accessTokenUrl;
    private String clientId;
    private String clientSecret;
    private String clientAuthenticationScheme;
}
