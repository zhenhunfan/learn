<template>
  <div class="tab-item" @click="itemClick">
    <slot v-if="!isActive" name="inactive"></slot>
    <slot v-else name="active"></slot>
    <div :style="activeFontColor">{{ text }}</div>
  </div>
</template>

<script>
export default {
  props: {
    text: String,
    path: String,
    fontColor: {
      type: String,
      default: "red"
    }
  },
  data() {
    return {};
  },
  computed: {
    isActive() {
      return this.$route.path.indexOf(this.path) != -1;
    },
    activeFontColor() {
      return this.isActive ? { color: this.fontColor } : {};
    }
  },
  methods: {
    itemClick() {
      this.$router.replace(this.path);
    }
  }
};
</script>
<style scoped>
.tab-item {
  flex: 1;
  text-align: center;
  height: 49px;
  font-size: 14px;
}

.tab-item img {
  width: 24px;
  height: 24px;
  vertical-align: middle;
  margin-top: 3px;
}
</style>