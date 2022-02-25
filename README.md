## 孤勇者论坛

github上，主要写的一个项目
##资料
https://spring.io/guides
https://spring.io/guides/gs/serving-web-content

https://docs.github.com/cn/developers/apps/building-oauth-apps/scopes-for-oauth-apps

## 工具
https://git-scm.com/download


##脚本
CREATE CACHED TABLE "PUBLIC"."USER"(
    "ID" INT DEFAULT NEXT VALUE FOR "PUBLIC"."SYSTEM_SEQUENCE_A25C50BD_0C80_4BE1_AB32_7BA3B8F7DC27" NOT NULL NULL_TO_DEFAULT SEQUENCE "PUBLIC"."SYSTEM_SEQUENCE_A25C50BD_0C80_4BE1_AB32_7BA3B8F7DC27",
    "ACCOUNT_ID" VARCHAR(100),
    "NAME" VARCHAR(50),
    "TOKEN" CHAR(36),
    "GMT_CREATE" BIGINT,
    "GMT_MODIFIED" BIGINT
)

