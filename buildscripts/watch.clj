(require 'cljs.build.api)

(cljs.build.api/watch "src"
    {:main 'hello.main :output-to "out/main.js"})
