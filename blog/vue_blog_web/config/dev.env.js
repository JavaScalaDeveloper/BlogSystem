'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',

  VUE_WEB: '"http://localhost:9527"',
  PICTURE_API: '"http://localhost:8607/blogpicture"',
	WEB_API: '"http://localhost:8607/blogweb"',
  SEARCH_API: '"http://localhost:8607/blogsearch"',

})
