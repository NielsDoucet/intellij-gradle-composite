# intellij gradle composite

## build base with gradle composite build

Inside base folder, execute:
```
./gradlew assemble --include-build ../transitive --include-build ../composite
```

Check the assembled warfile
```
unzip -l build/lib/base-1.0-SNAPSHOT.war
```
Example output
```
✔  16:34 ~/git/github/personal/intellij-gradle-composite/base [ master | ✚ 1 ] $ unzip -l build/libs/base-1.0-SNAPSHOT.war 
Archive:  build/libs/base-1.0-SNAPSHOT.war
  Length      Date    Time    Name
---------  ---------- -----   ----
        0  12-01-2017 16:34   META-INF/
       25  12-01-2017 16:34   META-INF/MANIFEST.MF
        0  12-01-2017 16:34   WEB-INF/
        0  12-01-2017 16:34   WEB-INF/classes/
        0  12-01-2017 16:34   WEB-INF/classes/com/
        0  12-01-2017 16:34   WEB-INF/classes/com/example/
        0  12-01-2017 16:34   WEB-INF/classes/com/example/composite/
        0  12-01-2017 16:34   WEB-INF/classes/com/example/composite/base/
     1535  12-01-2017 16:34   WEB-INF/classes/com/example/composite/base/Base.class
        0  12-01-2017 16:34   WEB-INF/lib/
     1194  12-01-2017 14:53   WEB-INF/lib/transitive-core-1.0-SNAPSHOT.jar
     1138  12-01-2017 14:53   WEB-INF/lib/composite-core-1.0-SNAPSHOT.jar
     1198  12-01-2017 14:53   WEB-INF/lib/transitive-dependency-1.0-SNAPSHOT.jar
     1132  12-01-2017 14:53   WEB-INF/lib/composite-dependency-1.0-SNAPSHOT.jar
---------                     -------
     6222                     14 files
```

## build artifact through IntelliJ

> Build > Build Artifacts > Gradle : com.example : base-1.0-SNAPSHOT.war

Check the assembled warfile
```
unzip -l build/lib/base-1.0-SNAPSHOT.war
```
Example output
```
✔  16:30 ~/git/github/personal/intellij-gradle-composite/base [ master | ✔  ] $ unzip -l build/libs/base-1.0-SNAPSHOT.war 
Archive:  build/libs/base-1.0-SNAPSHOT.war
  Length      Date    Time    Name
---------  ---------- -----   ----
       25  12-01-2017 16:29   META-INF/MANIFEST.MF
        0  12-01-2017 16:29   META-INF/
        0  12-01-2017 16:29   WEB-INF/
        0  12-01-2017 16:29   WEB-INF/classes/
        0  12-01-2017 16:29   WEB-INF/classes/com/
        0  12-01-2017 16:29   WEB-INF/classes/com/example/
        0  12-01-2017 16:29   WEB-INF/classes/com/example/composite/
        0  12-01-2017 16:29   WEB-INF/classes/com/example/composite/base/
     1535  12-01-2017 16:29   WEB-INF/classes/com/example/composite/base/Base.class
        0  12-01-2017 16:29   WEB-INF/lib/
     1138  12-01-2017 16:29   WEB-INF/lib/composite-core-1.0-SNAPSHOT.jar
      915  12-01-2017 16:29   WEB-INF/lib/composite-core_main
     1132  12-01-2017 16:29   WEB-INF/lib/composite-dependency-1.0-SNAPSHOT.jar
      909  12-01-2017 16:29   WEB-INF/lib/composite-dependency_main
     1194  12-01-2017 16:29   WEB-INF/lib/transitive-core-1.0-SNAPSHOT.jar
      971  12-01-2017 16:29   WEB-INF/lib/transitive-core_main
     1198  12-01-2017 16:29   WEB-INF/lib/transitive-dependency-1.0-SNAPSHOT.jar
      975  12-01-2017 16:29   WEB-INF/lib/transitive-dependency_main
---------                     -------
     9992                     18 files
```

Notice the inclusion of `/WEB-INF/lib/composite-core_main` and equivalents for other modules.
These are actually jars with an incorrect name.
