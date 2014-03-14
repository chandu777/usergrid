#!/bin/bash

buildMain(){
  echo #####
  echo grunt $1
  echo #####
  ./node_modules/grunt-cli/bin/grunt $1
}


npm install

case "$1" in
e2e) buildMain

    webdriver-manager start --standalone > seleniumLog.txt &
    sleep 10
    # run the build
    ./node_modules/grunt-cli/bin/grunt e2e
      # stop selenium
    curl -s -L http://localhost:4444/selenium-server/driver?cmd=shutDownSeleniumServer > seleniumLog.txt &
    ;;
dev) buildMain
    ./node_modules/grunt-cli/bin/grunt  $1
    ;;
*)   echo "pass e2e to run e2e tests"
   buildMain
   ;;
esac

echo ####
echo zip has been delivered to ./dist/


