# autoversioning

```
./mvnw clean package -Dproject.version=`date '+%Y%m%d%H%M%S'`-`git rev-parse --short HEAD`
```