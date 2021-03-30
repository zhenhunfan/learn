import axios from "axios";

const framworkRequest = axios.create({
  baseURL: "http://localhost/oa/Extensions/InvokeCenter/WebServices/Framework/FrameworkWebServices.asmx"
})
framworkRequest.interceptors.request.use(config => {
  console.log('我是request拦截器的config');
  return config;
}, err => {
  console.log(err);
})

framworkRequest.interceptors.response.use(res => {
  console.log('我是response拦截器的res');
  return res.data;
}, err => {
  console.log(err);
})


const oaRequest = axios.create({
  baseURL: "http://localhost/oa/Extensions/InvokeCenter/WebServices/OA/OAWebServices.asmx"
});

export {
  framworkRequest,
  oaRequest
}