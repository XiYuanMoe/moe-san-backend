初版entity结构

character: 萌选手, acg角色
challenge: 挑战, 萌战
challenge_stage: 挑战阶段, 用来配置挑战
challenge_registration: 用来将character注册到挑战中
challenge_history: 用来记录角色萌战历史 (并不准备记录正在进行的, 而是记录已经结束的)

正在进行的挑战信息将会通过redis来存储