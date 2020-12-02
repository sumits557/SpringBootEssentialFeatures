# SpringBootEssentialFeatures
Endpoints:
- http://localhost:8080/
- http://localhost:8080/heath
- http://localhost:8080/mappings


 Command to generate keystore.jks: run the below command from terminal window.

 keytool -genkey -keyalg RSA -alias ssharma -keystore keystore.jks -storepass password -validity 4000 -keysize 2048
 
Verify the https url for your api:

http --verify=no https://localhost:8080/api/greeting