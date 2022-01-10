let fs = require("fs");
const FILE_NAME = "./assets/users.json"
let usersRepo = {
    get: function (resolve, reject) {
        fs.readFile(FILE_NAME, function (err, data) {
          if (err) {
            reject(err);
          }
          else {
            resolve(JSON.parse(data));
          }
        });
    },
    
    getById: function (id, resolve, reject) {
      fs.readFile(FILE_NAME, function (err, data) {
        if (err) {
          reject(err);
        }
        else {
          let pie = JSON.parse(data).find(p => p.id == id);
          resolve(pie);
        }
      });
    },


    insert: function (newData, resolve, reject) {
      fs.readFile(FILE_NAME, function (err, data) {
        if (err) {
          reject(err);
        }
        else {
          let users = JSON.parse(data);
          users.push(newData);
          fs.writeFile(FILE_NAME, JSON.stringify(users), function (err) {
            if (err) {
              reject(err);
            }
            else {
              resolve(newData);
            }
          });
        }
      });
    }
};

module.exports = usersRepo;