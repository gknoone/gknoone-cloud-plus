spring:
  cloud:
    nacos:
      config:
        server-addr: 127.0.0.1:8848
        file-extension: yaml
        namespace: a1566156-8210-488e-9339-1a16d28ca31c
        group: uyaki-cloud
        # 共享配置
        ext-config:
          # postgresql
          - data-id: app-common-postgresql.yaml
            group: uyaki-cloud
            namespace: a1566156-8210-488e-9339-1a16d28ca31c
            refresh: true
          # mybatis
          - data-id: app-common-mybatis.yaml
            group: uyaki-cloud
            namespace: a1566156-8210-488e-9339-1a16d28ca31c
            refresh: true