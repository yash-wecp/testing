echo "---------- Install node ------------"
sudo apt-get install -y npm
sudo npm install -g n
sudo n 18.13

echo "---------- Install node packages required by the project ------------"
cd client
npm install --force