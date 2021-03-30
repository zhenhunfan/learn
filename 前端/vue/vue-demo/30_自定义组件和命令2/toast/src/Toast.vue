<template>
  <div class="table" v-show="isShow">{{ msg }}</div>
</template>

<script>
export default {
  components: {},
  props: {},
  data() {
    return {
      msg: "",
      isShow: false
    };
  },
  methods: {
    show(message, duration = 2000) {
      this.isShow = true;
      this.msg = message;
      setTimeout(() => {
        this.isShow = false;
        this.msg = "";
      }, duration);
    }
  }
};
</script>
<style scoped>
.table {
  position: fixed;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);

  border-radius: 8px;
  z-index: 999;
  padding: 8px 10px;
  color: #ffffff;
  background-color: rgba(0, 0, 0, 0.75);
}
</style>
