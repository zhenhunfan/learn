<template>
  <div
    class="zhf-input zhf-input--suffix"
    :class="{ 'zhf-input--suffix': showSuffix }"
  >
    <input
      class="zhf-input__inner"
      :class="{ 'is-disabled': disabled }"
      :placeholder="placeholder"
      :type="showPassword ? (passwordVisible ? 'text' : 'password') : type"
      :name="name"
      :value="value"
      @input="handleInput"
    />
    <span class="zhf-input__suffix" v-if="showSuffix">
      <i
        class="zhf-input__icon zhf-icon-circle-close"
        v-if="clearable && value"
        @click="clear"
      >
      </i>
      <i
        class="zhf-input__icon zhf-icon-view"
        v-if="showPassword"
        @click="handlePasswordVisible"
        :class="{ 'zhf-icon-view-active': passwordVisible }"
      ></i>
    </span>
  </div>
</template>

<script>
export default {
  name: "zhf-input",
  components: {},
  props: {
    placeholder: {
      type: String,
      default: "",
    },
    type: {
      type: String,
      default: "text",
    },
    name: {
      type: String,
      default: "",
    },
    disabled: {
      type: Boolean,
      default: false,
    },
    value: [String, Number],
    clearable: {
      type: Boolean,
      default: false,
    },
    showPassword: {
      type: Boolean,
      default: false,
    },
  },
  data() {
    return {
      // 是否显示密码
      passwordVisible: false,
    };
  },
  computed: {
    showSuffix() {
      return this.clearable || this.showPassword;
    },
  },
  watch: {},
  created() {},
  mounted() {},
  methods: {
    handleInput(e) {
      this.$emit("input", e.target.value);
    },
    clear() {
      this.$emit("input", "");
    },
    handlePasswordVisible() {
      // 切换type类型
      this.passwordVisible = !this.passwordVisible;
    },
  },
};
</script>
<style lang="scss" >
.zhf-input {
  width: 100%;
  position: relative;
  font-size: 14px;
  display: inline-block;
  .zhf-input__inner {
    -webkit-appearance: none;
    background-color: #fff;
    background-image: none;
    border-radius: 4px;
    border: 1px solid #dcdfe6;
    box-sizing: border-box;
    color: #606266;
    display: inline-block;
    font-size: inherit;
    height: 40px;
    line-height: 40px;
    outline: none;
    padding: 0 15px;
    transition: border-color 0.2s cubic-bezier(0.645, 0.045, 0.355, 1);
    width: 100%;

    &:focus {
      outline: none;
      border-color: #409eff;
    }
    &.is-disabled {
      background-color: #f5f7fa;
      border-color: #e4e7ed;
      color: #c0c4cc;
      cursor: not-allowed;
    }
  }
}
.zhf-input--suffix {
  .zhf-input__inner {
    padding-right: 30px;
  }
  .zhf-input__suffix {
    position: absolute;
    height: 100%;
    right: 10px;
    top: 0;
    line-height: 40px;
    text-align: center;
    color: #c0c4cc;
    transition: all 0.3s;
    z-index: 900;
    i {
      color: #c0c4cc;
      font-size: 14px;
      cursor: pointer;
      transition: color 0.2s cubic-bezier(0.645, 0.045, 0.355, 1);
    }
    .zhf-icon-view-active {
      color: blue;
    }
  }
}
</style>