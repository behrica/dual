# Purpose

An example of a multi container setup which shows how Python (in form of Basilisp)
and Clojure can work together in a 2 component micro service architecture.

Folder `dual_basilisp` contains a FastAPI server in Basilisp, which compiles to python and is 100 % python compatible.
Folder `dual_clj` contains a Clojure application calling the FastAPI server.

In this way Clojure can make use of Python libraries out-or-process, with data exchange in JSON.

The setup is working specially well with VSCode. Both folders can be opened as two VSCode windows, each having its own devcontainer in which
the setup for Baslilisp and Clojure is auto-installed.

Both communicate via a Docker internal network, which need to be created before starting the devcontainer:

This is an alternative approach of making existing Python libraries usable from Clojure, in this case using Lisp/Clojure syntax on both sides.


```bash
docker network create dual-network
```


