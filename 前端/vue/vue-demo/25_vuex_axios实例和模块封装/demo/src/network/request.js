import axios from "axios";

export const framworkRequest = axios.create({
    baseURL: "http://localhost/oa/Extensions/InvokeCenter/WebServices/Framework/FrameworkWebServices.asmx"
})

export const oaRequest = axios.create({
    baseURL: "http://localhost/oa/Extensions/InvokeCenter/WebServices/OA/OAWebServices.asmx"
});