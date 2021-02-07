<template>
  <div>
    <svg-icon icon-class="doc" style="height: 2.5em;font-size: 18px;cursor: pointer" @click.native="goto"/>
  </div>
</template>

<script>
export default {
  name: 'blogDoc',
  data() {
    return {
      url: 'http://159753.gitee.io/blog_doc/#/'
    }
  },
  methods: {
    goto() {
      window.open(this.url)
    }
  }
}
</script>
