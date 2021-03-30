<template>
  <div>
    <tab-bar>
      <TabBarItem text="首页" path="/home">
        <template v-slot:inactive>
          <img src="@assets/img/tabbar/index.png" />
        </template>
        <template v-slot:active>
          <img src="@assets/img/tabbar/index_active.png" />
        </template>
      </TabBarItem>
      <TabBarItem text="分类" path="/category">
        <template v-slot:inactive>
          <img src="@assets/img/tabbar/category.png" />
        </template>
        <template v-slot:active>
          <img src="@assets/img/tabbar/category_active.png" />
        </template>
      </TabBarItem>
      <TabBarItem text="购物车" path="/cart">
        <template v-slot:inactive>
          <img src="@assets/img/tabbar/purchase.png" />
        </template>
        <template v-slot:active>
          <img src="@assets/img/tabbar/purchase_active.png" />
        </template>
      </TabBarItem>
      <TabBarItem text="我的" path="/me">
        <template v-slot:inactive>
          <img src="@assets/img/tabbar/me.png" />
        </template>
        <template v-slot:active>
          <img src="@assets/img/tabbar/me_active.png" />
        </template>
      </TabBarItem>
    </tab-bar>
  </div>
</template>

<script>
import TabBar from "@components/tabbar/TabBar";
import TabBarItem from "@components/tabbar/TabBarItem";

export default {
  name: "MainTabBar",
  data() {
    return {};
  },
  components: {
    TabBar,
    TabBarItem
  }
};
</script>
<style scoped>
@import "../assets/css/base.css";
</style>