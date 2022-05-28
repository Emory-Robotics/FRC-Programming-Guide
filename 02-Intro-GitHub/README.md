# 02 - Intro: GitHub

## What is GitHub

GitHub is an online provider for code hosting. GitHub uses `git` for
version control in "repositories", or projects.

Think of GitHub as a Google Drive for code. You can store files,
you can edit files with multiple people, etc.

## Git vs GitHub

Git is a version control tool. GitHub uses Git to manage versions of sources of code.
Git is not used on GitHub exclusively and it's commands are transferable to other providers.
GitHub is a provider which utilizes Git for version control.

[![Git Vs GitHub](https://img.youtube.com/vi/wpISo9TNjfU/default.jpg)](https://www.youtube.com/watch?v=wpISo9TNjfU)

## Useful GitHub Commands

[![GitHub Commands](https://img.youtube.com/vi/USjZcfj8yxE/default.jpg)](https://www.youtube.com/watch?v=USjZcfj8yxE)

**Things to remember:**

- `git add`
- `git commit`
- `git push`
- `git branch`
- `git checkout`

**Things to note:**

Commit Messages should be detailed in explaining anything added, fixed, or removed.
You should also include any know bugs or issues your commit might have introduced.

Example of commit message:

```
Implemented drive train which allows the robot to drive using arcade drive with an Xbox Controller.

Implemented arcade drive using the DifferentialDrive class and 4
FalconFX motors wired in CAN. Added DrivetrainCommand which uses the DrivetrainSubsystem
to drive. The left joystick controls all drive train logic. X-axis defines rotation.
Y-axis defines throttle.
```

## Using Git & GitHub

[![Using Git & GitHub](https://img.youtube.com/vi/nhNq2kIvi9s/default.jpg)](https://www.youtube.com/watch?v=nhNq2kIvi9s)

**Things to remember:**

- Creating a GitHub repository
- Git Clone
- `git push` 
- `git pull`
- Creating a pull request 
- Code review

**Things to note:**

- Branch names should follow the following style: `<github username>-<issue number>`
  - `<github username>`: Your github username in all lowercase
  - `<issue number>`: The issue number you are addressing (see next section)

### GitHub Issues

[![GitHub Issues](https://img.youtube.com/vi/WMykv2ZMyEQ/default.jpg)](https://www.youtube.com/watch?v=WMykv2ZMyEQ)

**Things to remember:**

- How to create an issue 
- How to assign a user to issues & other assignable information
- How to reference issues in comments & commits
- How to reference commits in comments & issues
- How to resolve issues

### GitHub Boards

[![GitHub Boards](https://img.youtube.com/vi/ff5cBkPg-bQ/default.jpg)](https://www.youtube.com/watch?v=ff5cBkPg-bQ)

**Things to remember:**

- Where to find the boards view
- How to create a task
- How to interact with tasks
- How to add an issue to the board

## [Codelab](./code-lab/README.md)


