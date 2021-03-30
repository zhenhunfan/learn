<template>
  <div>
    <!-- 开始 button演示,演示的话修改下面的v-if="true" -->
    <div v-if="false">
      <div class="row">
        <zhf-button @click="fn">按钮</zhf-button>
        <zhf-button type="primary">按钮</zhf-button>
        <zhf-button type="success">按钮</zhf-button>
        <zhf-button type="info">按钮</zhf-button>
        <zhf-button type="warning">按钮</zhf-button>
        <zhf-button type="danger">按钮</zhf-button>
      </div>
      <div class="row">
        <zhf-button plain>按钮</zhf-button>
        <zhf-button plain type="primary">按钮</zhf-button>
        <zhf-button plain type="success">按钮</zhf-button>
        <zhf-button plain type="info">按钮</zhf-button>
        <zhf-button plain type="warning">按钮</zhf-button>
        <zhf-button plain type="danger">按钮</zhf-button>
      </div>
      <div class="row">
        <zhf-button plain round>按钮</zhf-button>
        <zhf-button plain round type="primary">按钮</zhf-button>
        <zhf-button plain round type="success">按钮</zhf-button>
        <zhf-button plain round type="info">按钮</zhf-button>
        <zhf-button plain round type="warning">按钮</zhf-button>
        <zhf-button plain round type="danger">按钮</zhf-button>
      </div>
      <div class="row">
        <zhf-button plain circle>拆</zhf-button>
        <zhf-button plain circle type="primary">拆</zhf-button>
        <zhf-button plain circle type="success">拆</zhf-button>
        <zhf-button plain circle type="info">拆</zhf-button>
        <zhf-button plain circle type="warning">拆</zhf-button>
        <zhf-button plain circle type="danger">拆</zhf-button>
      </div>
      <div class="row">
        <zhf-button plain icon="zhf-icon-delete" circle></zhf-button>
        <zhf-button
          plain
          icon="zhf-icon-delete"
          circle
          type="primary"
        ></zhf-button>
        <zhf-button
          plain
          icon="zhf-icon-delete"
          circle
          type="success"
        ></zhf-button>
        <zhf-button
          plain
          icon="zhf-icon-delete"
          circle
          type="info"
        ></zhf-button>
        <zhf-button
          plain
          icon="zhf-icon-delete"
          circle
          type="warning"
        ></zhf-button>
        <zhf-button
          plain
          icon="zhf-icon-delete"
          circle
          type="danger"
        ></zhf-button>
      </div>
      <div class="row">
        <zhf-button plain disabled circle>拆</zhf-button>
        <zhf-button plain disabled circle type="primary">拆</zhf-button>
        <zhf-button plain disabled circle type="success">拆</zhf-button>
        <zhf-button plain disabled circle type="info">拆</zhf-button>
        <zhf-button plain disabled circle type="warning">拆</zhf-button>
        <zhf-button plain disabled circle type="danger">拆</zhf-button>
      </div>
    </div>
    <!-- 结束 button演示 -->

    <!-- 开始 dialog演示,演示的话修改下面的v-if="true -->
    <div v-if="false">
      <zhf-dialog :visible.sync="dialogVisible"></zhf-dialog>
      <zhf-button @click="dialogVisible = true">按钮</zhf-button>
    </div>
    <!-- 结束 dialog演示 -->

    <!-- 开始 input演示,演示的话修改下面的v-if="true -->
    <div v-if="false">
      <zhf-input placeholder="请输入字符串"></zhf-input>
      <!-- 开始 禁用演示 -->
      <zhf-input placeholder="请输入字符串" disabled></zhf-input>
      <!-- 结束 禁用演示 -->
      <!-- 开始 v-model演示 -->
      <zhf-input placeholder="请输入字符串" v-model="inputValue"></zhf-input>
      <!-- 结束 v-model演示 -->
      <!-- 开始 清空和密码显示演示 -->
      <zhf-input placeholder="请输入字符串" v-model="inputValue" clearable>
      </zhf-input>
      <zhf-input
        placeholder="请输入字符串"
        v-model="inputValue"
        showPassword
        type="password"
      >
      </zhf-input>
      <!-- 结束 清空和密码显示演示 -->
    </div>
    <!-- 结束 input演示 -->

    <!-- 开始 switch演示,演示的话修改下面的v-if="true -->
    <div v-if="false">
      <zhf-switch v-model="switchValue"></zhf-switch>
      <!-- 开始 自定义激活和非激活颜色演示 -->
      <zhf-switch
        v-model="switchValue"
        active-color="#13ce66"
        inactive-color="#ff4949"
      ></zhf-switch>
      <!-- 结束 自定义激活和非激活颜色演示 -->
    </div>
    <!-- 结束 switch演示 -->

    <!-- 开始 radio演示,演示的话修改下面的v-if="true -->
    <div v-if="false">
      <!-- 开始 一个普通的radio -->
      <zhf-radio label="1" v-model="gender">男</zhf-radio>
      <zhf-radio label="0" v-model="gender">女</zhf-radio>
      <!-- 结束 一个普通的radio -->

      <!-- 开始 一个普通的radio，不传插槽 -->
      <zhf-radio label="1" v-model="gender"></zhf-radio>
      <zhf-radio label="0" v-model="gender"></zhf-radio>
      <!-- 结束 一个普通的radio，不传插槽 -->
    </div>
    <!-- 结束 radio演示 -->

    <!-- 开始 radioGroup演示,演示的话修改下面的v-if="true -->
    <div v-if="false">
      <zhf-radio-group v-model="gender">
        <zhf-radio label="1">男</zhf-radio>
        <zhf-radio label="0">女</zhf-radio>
      </zhf-radio-group>
    </div>
    <!-- 结束 radioGroup演示 -->

    <!-- 开始 checkbox演示,演示的话修改下面的v-if="true -->
    <div v-if="false">
      <zhf-checkbox v-model="active">是否选中</zhf-checkbox>
    </div>
    <!-- 结束 checkbox演示 -->

    <!-- 开始 checkboxgroup演示,演示的话修改下面的v-if="true -->
    <div v-if="false">
      <zhf-checkbox-group v-model="hobby">
        <zhf-checkbox label="抽烟"></zhf-checkbox>
        <zhf-checkbox label="喝酒"></zhf-checkbox>
        <zhf-checkbox label="烫头"></zhf-checkbox>
      </zhf-checkbox-group>
    </div>
    <!-- 结束 checkboxgroup演示 -->

    <!-- 开始 form和form-item演示,演示的话修改下面的v-if="true -->
    <div v-if="true">
      <zhf-form :model="model">
        <zhf-form-item label="用户名">
          <zhf-input placeholder="请输入用户名"></zhf-input>
        </zhf-form-item>
      </zhf-form>
    </div>
    <!-- 结束 form和form-item演示 -->
  </div>
</template>

<script>
export default {
  data() {
    return {
      dialogVisible: false,
      inputValue: "abc",
      switchValue: true,
      gender: "",
      active: false,
      hobby: ["抽烟", "喝酒", "烫头"],
      model: {},
    };
  },
  methods: {
    fn(e) {
      console.log("123");
    },
  },
};
</script>

<style lang="scss" scoped>
.row {
  margin-bottom: 20px;
  .zhf-button {
    margin-right: 20px;
  }
}
.zhf-input {
  width: 180px;
}
</style>
