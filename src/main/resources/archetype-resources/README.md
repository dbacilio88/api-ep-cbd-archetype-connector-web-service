#set( $customCharacters = '#' )

# Ejército del Perú - Centro de Infromática del Ejército

## ${artifactId}

![GitHub repo size](https://img.shields.io/github/repo-size/dbacilio88/${artifactId})
![GitHub repo file count](https://img.shields.io/github/directory-file-count/dbacilio88/${artifactId})
![GitHub all releases](https://img.shields.io/github/downloads/dbacilio88/${artifactId}/total)
[![GitHub contributors](https://img.shields.io/github/contributors/dbacilio88/${artifactId})](https://github.com/dbacilio88/${artifactId}/graphs/contributors)
[![GitHub last commit](https://img.shields.io/github/last-commit/dbacilio88/${artifactId}?logoColor=success)](https://github.com/dbacilio88/${artifactId}/graphs/commit-activity)
![GitHub pull requests](https://img.shields.io/github/issues-pr/dbacilio88/${artifactId}?color=red)
![GitHub language count](https://img.shields.io/github/languages/count/dbacilio88/${artifactId})
![GitHub followers](https://img.shields.io/github/followers/dbacilio88?style=social)
[![GitHub watchers](https://img.shields.io/github/watchers/dbacilio88/${artifactId}?style=social)](https://github.com/dbacilio88/${artifactId}/watchers)
[![**GitHub Repo
stars**](https://img.shields.io/github/stars/dbacilio88/${artifactId}?style=social)](https://github.com/dbacilio88/${artifactId}/stargazers)

Plantilla de desarrollo con Spring Boot.

* [Dependencias Externas](#external-dependencies)
* [Dependencias Internas](#internal-dependencies)

## <a name="external-dependencies"></a>Dependencias Externas

    <dependencies>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-web</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-logging</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-autoconfigure</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-logging</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web-services</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-web</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-logging</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-aop</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>${dependency-org.mapstruct-version}</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-aop</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-logging</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>${dependency-org.postgresql-version}</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>org.mock-server</groupId>
            <artifactId>mockserver-junit-jupiter</artifactId>
            <version>${dependency-org.mock-server-version}</version>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>jakarta.validation</groupId>
                    <artifactId>jakarta.validation-api</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

    </dependencies>

## <a name="internal-dependencies"></a>Dependencias Internas

    <dependencies>

        <dependency>
            <groupId>ep.mil.microservices</groupId>
            <artifactId>lib-ep-cbd-microservices-utils</artifactId>
            <version>${dependency-lib-ep-cbd-microservices-utils-version}</version>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-web</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>ep.mil.microservices</groupId>
            <artifactId>lib-ep-cbd-microservices-web-service</artifactId>
            <version>${dependency-lib-ep-cbd-microservices-web-service-version}</version>
        </dependency>

    </dependencies>

© 2023 Ejército del Perú. All rigths reserved