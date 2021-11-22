<template>
   <a-layout>
     <a-layout-sider width="200" style="background: #fff">
       <a-menu
           mode="inline"
           :default-selected-keys="['1']"
           :default-open-keys="['sub1']"
           style="height: 100%"
       >
         <a-sub-menu key="sub1">
           <span slot="title"><a-icon type="user" />subnav 1</span>
           <a-menu-item key="1">
             option1
           </a-menu-item>
           <a-menu-item key="2">
             option2
           </a-menu-item>
           <a-menu-item key="3">
             option3
           </a-menu-item>
           <a-menu-item key="4">
             option4
           </a-menu-item>
         </a-sub-menu>
         <a-sub-menu key="sub2">
           <span slot="title"><a-icon type="laptop" />subnav 2</span>
           <a-menu-item key="5">
             option5
           </a-menu-item>
           <a-menu-item key="6">
             option6
           </a-menu-item>
           <a-menu-item key="7">
             option7
           </a-menu-item>
           <a-menu-item key="8">
             option8
           </a-menu-item>
         </a-sub-menu>
         <a-sub-menu key="sub3">
           <span slot="title"><a-icon type="notification" />subnav 3</span>
           <a-menu-item key="9">
             option9
           </a-menu-item>
           <a-menu-item key="10">
             option10
           </a-menu-item>
           <a-menu-item key="11">
             option11
           </a-menu-item>
           <a-menu-item key="12">
             option12
           </a-menu-item>
         </a-sub-menu>
       </a-menu>
     </a-layout-sider>
     <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">
       <pre>
         {{ebooks}}
         {{ebooks2}}
       </pre>
     </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import { defineComponent,onMounted,ref,reactive,toRef } from 'vue';
import axios from "axios";
export default defineComponent({
  name: 'home',
   setup() {
    console.log('setup')
     let ebooks = ref();
     let ebooks1 = reactive({books:[]});
    onMounted( async ()=>{
      console.log('onMounted')
      let res = await axios.get("http://127.0.0.1:8880/ebook/list?name=教程")
      if (res){
        let data = res.data
        ebooks.value = data.content;
        ebooks1.books = data.content
        console.log(ebooks)

      }
    })

     return {
       ebooks,
       ebooks2:toRef(ebooks1,"books")
     }
  }
});
</script>
