const express = require("express");
const db = require("./src/db/connect");
const path = require("path");
const app = express();
const Mail = require("./src/utils/mail");
const bodypaser = require("body-parser");
const request = require("request");
app.use(bodypaser.urlencoded({
    extended: false
}));
app.use(bodypaser.json());
//通过cors 解决跨域
const cors = require("cors");
app.use(cors());

app.use("/public", express.static(path.join(__dirname, "./static")));
// 路由
const userRouter = require("./src/router/userRouter");
const fooodRouter = require("./src/router/foodRouter");
const fileRouter = require("./src/router/fileRouter");
app.use("/user", userRouter);
app.use("/food", fooodRouter);
app.use("/file", fileRouter);

app.listen(3000, () => {
    console.log("server start");
});