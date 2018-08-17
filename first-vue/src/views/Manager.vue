<template>
  <div class="Manager">
    
    <div id="Title">这是PAGE1</div>
  </div>
</template>

<script>
export default {
  name: "Manager"
}
</script>

<style lang="css">
	h2 {
		font-size: 1.35em;
		line-height: 1.75em;
  }
  h2:before， h2:after {
      	content: '';
				display: block;
				height: 1px;
			}
h2:before {
    top: 0;
    left: 0;
}


h2:before, h2:after {
    transition: width 0.85s ease;
    transition-delay: 0.25s;
    background: #fff;
    content: '';
    display: block;
    height: 2px;
    position: absolute;
    width: 100%;
}
</style>

