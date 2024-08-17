echo "---------- Install java ------------"
sudo apt install openjdk-11-jdk -y


echo "---------- Install java packages ------------"
cd server
chmod +x ./mvnw
./mvnw clean install -DskipTests
