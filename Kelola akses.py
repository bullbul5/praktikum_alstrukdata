class FSA:

    def __init__(self, states, transitions):
        self.states = states
        self.transitions = transitions

    def run(self, input):
        state = "READ"
        for character in input:
            if (state, character) in self.transitions:
                state = self.transitions[(state, character)]

        return state


states = ["READ", "WRITE"]
transitions = {
    ("READ", "r"): "READ",
    ("READ", "w"): "WRITE",
    ("WRITE", "r"): "READ",
    ("WRITE", "w"): "WRITE",
}

fsa = FSA(states, transitions)

print(fsa.run("r"))
# Output: "READ"
print(fsa.run("w"))
# Output: "WRITE"
