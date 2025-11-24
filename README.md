# purpose

An example of a multi container setup which show how Python (in form of Basilisp)
and clojure can work together in a 2 component micro service architecture.

Folder `dual_basilisp` contains a FastAPI server in Basilisp, which compiles to python and is 100 % python compatible.
Folder `dual_clj` contains a Clojure application calling the FastAPI server.

In this way Clojure can make use of Python libraries out-or-process, with data exchange in JSON.

The setup is working specially well with VsCode. Both folders can be opened as two VSCode windows, each having its own devcontainer.


