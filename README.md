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

## build artifact through IntelliJ

> Build > Build Artifacts > Gradle : com.example : base-1.0-SNAPSHOT.war

Check the assembled warfile
```
unzip -l build/lib/base-1.0-SNAPSHOT.war
```
