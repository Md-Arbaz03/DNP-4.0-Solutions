# Git Hands-on 5

```bash
Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo
$ git init
Initialized empty Git repository in C:/Users/Md Arbaz Salim/Desktop/Week8_Git/5_Git-HOL/GitDemo/.git/

Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo (main)
$ echo "I am solving hands-on 5" > file.txt

Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo (main)
$ git add file.txt

Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo (main)
$ git commit -m "Adding file in remote repo"
[main (root-commit) cf2a0ed] Adding file in remote repo
1 file changed, 1 insertion(+)
create mode 100644 file.txt

Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo (main)
$ git status
On branch main
nothing to commit, working tree clean

Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo (main)
$ git branch

- main

Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo (main)
$ git remote add origin https://github.com/Md-Arbaz03/my-demo.git

Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo (main)
$ git remote -v
origin https://github.com/Md-Arbaz03/my-demo.git (fetch)
origin https://github.com/Md-Arbaz03/my-demo.git (push)

Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo (main)
$ git pull origin main --allow-unrelated-histories
From https://github.com/Md-Arbaz03/my-demo

- branch main -> FETCH_HEAD
  Merge made by the 'ort' strategy.
  .gitignore | 2 ++
  README.md | 9 +++++++++
  app.js | 0
  check.txt | 1 +
  index.html | 0
  style.css | 0
  welcome.txt | 1 +
  7 files changed, 13 insertions(+)
  create mode 100644 .gitignore
  create mode 100644 README.md
  create mode 100644 app.js
  create mode 100644 check.txt
  create mode 100644 index.html
  create mode 100644 style.css
  create mode 100644 welcome.txt

Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo (main)
$ git push origin main
Enumerating objects: 6, done.
Counting objects: 100% (6/6), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (5/5), 548 bytes | 274.00 KiB/s, done.
Total 5 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Md-Arbaz03/my-demo.git
7a314c7..4e34bcf main -> main

Md Arbaz Salim@DESKTOP-VPU42RD MINGW64 ~/Desktop/Week8_Git/5_Git-HOL/GitDemo (main)
$
```
