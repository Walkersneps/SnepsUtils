# SnepsUtils

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/tk.sneps.utils/snepsutils/badge.svg?style=flat)](http://mvnrepository.com/artifact/tk.sneps.utils/snepsutils)

[![Build Status](https://travis-ci.org/Walkersneps/SnepsUtils.svg?branch=master)](https://travis-ci.org/Walkersneps/SnepsUtils)
[![Circle-CI](https://circleci.com/gh/Walkersneps/SnepsUtils.svg?style=shield&circle-token=:circle-token)](https://circleci.com/gh/Walkersneps/SnepsUtils)
[![codecov](https://codecov.io/gh/Walkersneps/SnepsUtils/branch/master/graph/badge.svg)](https://codecov.io/gh/Walkersneps/SnepsUtils)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/9605f08d84af42d6a9c32f8c8ddcd212)](https://www.codacy.com/app/walkersneps/SnepsUtils?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Walkersneps/SnepsUtils&amp;utm_campaign=Badge_Grade)

A compilation of utilities, macros and aliases for common commands, just because Walkersneps is very lazy. Fuck yeah!

---
### Use SnepsUtils in your project
######Maven
To import the library with _Apache Maven_, add the following lines to your `pom.xml`, under section `<dependencies>`.
```xml
<dependency>
    <groupId>tk.sneps.utils</groupId>
    <artifactId>snepsutils</artifactId>
    <version>0.1.14</version>
</dependency>
```
Since I'll ~~probably~~ _definitely_ forget to update the code above, please make sure you're using the latest available version. You can check that on the badge under the title, or, better, at [this link](https://oss.sonatype.org/content/groups/public/tk/sneps/utils/snepsutils/ "SnepsUtils repository").

######Other build tools
To import SnepsUtils with other dependency managers, like _Buildr_, _Ivy_, _Grape_, _Gradle/Sails_, _SBT_ or _Leiningen_, you can use the auto-generated snippets available on the page linked on the badge, but that's kinda slow in indexing new versions. If you want to make sure to get the latest version, use [the official Maven central search engine](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22tk.sneps.utils%22 "Maven Central Repository search engine"), which is updated more frequently, but is a bit more technical.

######Manually
Download latest compiled classes:
```bash
curl -L "http://repository.sonatype.org/service/local/artifact/maven/redirect?r=central-proxy&g=tk.sneps.utils&a=snepsutils&v=LATEST" -o snepsutils.jar
```
Then import snepsutils.jar as a project library in your IDE.

You can also click on [this link](http://repository.sonatype.org/service/local/artifact/maven/redirect?r=central-proxy&g=tk.sneps.utils&a=snepsutils&v=LATEST "Download latest jar package") to download the latest jar package from your browser.

