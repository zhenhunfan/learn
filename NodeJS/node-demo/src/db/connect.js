const config = require('../../config.json')
const mongoose = require('mongoose')

//  连接数据库
const url = `mongodb://${config.db.user}:${config.db.pass}@${config.db.servername}:${config.db.port}/${config.db.DATABASE}`
mongoose.connect(url, {
  useNewUrlParser: true,
  useUnifiedTopology: true
});
//连接数据库
var db = mongoose.connection; //数据库的连接对象
db.on('error', console.error.bind(console, 'connection error:'));
db.once('open', function () {
  console.log('db ok')
});