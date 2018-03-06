(require 'cljs.build.api)

(cljs.build.api/build "src"
    {:main 'hello.main :output-to "out/main.js"})
