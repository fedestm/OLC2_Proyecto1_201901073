// Code generated from Lexico.g4 by ANTLR 4.9.2. DO NOT EDIT.

package parser

import (
	"fmt"
	"unicode"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = unicode.IsLetter

var serializedLexerAtn = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 17, 121,
	8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7,
	9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12,
	4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 3,
	2, 3, 2, 3, 3, 3, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 9, 3, 9, 3, 10, 6, 10, 70, 10,
	10, 13, 10, 14, 10, 71, 3, 11, 6, 11, 75, 10, 11, 13, 11, 14, 11, 76, 3,
	11, 3, 11, 6, 11, 81, 10, 11, 13, 11, 14, 11, 82, 3, 12, 3, 12, 7, 12,
	87, 10, 12, 12, 12, 14, 12, 90, 11, 12, 3, 12, 3, 12, 3, 13, 3, 13, 3,
	13, 3, 13, 3, 13, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 15, 3, 15,
	7, 15, 107, 10, 15, 12, 15, 14, 15, 110, 11, 15, 3, 16, 6, 16, 113, 10,
	16, 13, 16, 14, 16, 114, 3, 16, 3, 16, 3, 17, 3, 17, 3, 17, 2, 2, 18, 3,
	3, 5, 4, 7, 5, 9, 6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 12, 23, 13,
	25, 14, 27, 15, 29, 16, 31, 17, 33, 2, 3, 2, 9, 3, 2, 50, 59, 3, 2, 48,
	48, 3, 2, 36, 36, 5, 2, 67, 92, 97, 97, 99, 124, 6, 2, 50, 59, 67, 92,
	97, 97, 99, 124, 5, 2, 11, 12, 15, 15, 34, 34, 9, 2, 34, 35, 37, 37, 45,
	45, 47, 48, 60, 60, 66, 66, 93, 95, 2, 125, 2, 3, 3, 2, 2, 2, 2, 5, 3,
	2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3, 2, 2, 2, 2, 11, 3, 2, 2, 2, 2, 13,
	3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17, 3, 2, 2, 2, 2, 19, 3, 2, 2, 2, 2,
	21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2, 25, 3, 2, 2, 2, 2, 27, 3, 2, 2, 2,
	2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2, 3, 35, 3, 2, 2, 2, 5, 37, 3, 2, 2,
	2, 7, 39, 3, 2, 2, 2, 9, 48, 3, 2, 2, 2, 11, 52, 3, 2, 2, 2, 13, 56, 3,
	2, 2, 2, 15, 61, 3, 2, 2, 2, 17, 66, 3, 2, 2, 2, 19, 69, 3, 2, 2, 2, 21,
	74, 3, 2, 2, 2, 23, 84, 3, 2, 2, 2, 25, 93, 3, 2, 2, 2, 27, 98, 3, 2, 2,
	2, 29, 104, 3, 2, 2, 2, 31, 112, 3, 2, 2, 2, 33, 118, 3, 2, 2, 2, 35, 36,
	7, 42, 2, 2, 36, 4, 3, 2, 2, 2, 37, 38, 7, 43, 2, 2, 38, 6, 3, 2, 2, 2,
	39, 40, 7, 114, 2, 2, 40, 41, 7, 116, 2, 2, 41, 42, 7, 107, 2, 2, 42, 43,
	7, 112, 2, 2, 43, 44, 7, 118, 2, 2, 44, 45, 7, 110, 2, 2, 45, 46, 7, 112,
	2, 2, 46, 47, 7, 35, 2, 2, 47, 8, 3, 2, 2, 2, 48, 49, 7, 107, 2, 2, 49,
	50, 7, 56, 2, 2, 50, 51, 7, 54, 2, 2, 51, 10, 3, 2, 2, 2, 52, 53, 7, 104,
	2, 2, 53, 54, 7, 56, 2, 2, 54, 55, 7, 54, 2, 2, 55, 12, 3, 2, 2, 2, 56,
	57, 7, 40, 2, 2, 57, 58, 7, 117, 2, 2, 58, 59, 7, 118, 2, 2, 59, 60, 7,
	116, 2, 2, 60, 14, 3, 2, 2, 2, 61, 62, 7, 100, 2, 2, 62, 63, 7, 113, 2,
	2, 63, 64, 7, 113, 2, 2, 64, 65, 7, 110, 2, 2, 65, 16, 3, 2, 2, 2, 66,
	67, 7, 61, 2, 2, 67, 18, 3, 2, 2, 2, 68, 70, 9, 2, 2, 2, 69, 68, 3, 2,
	2, 2, 70, 71, 3, 2, 2, 2, 71, 69, 3, 2, 2, 2, 71, 72, 3, 2, 2, 2, 72, 20,
	3, 2, 2, 2, 73, 75, 9, 2, 2, 2, 74, 73, 3, 2, 2, 2, 75, 76, 3, 2, 2, 2,
	76, 74, 3, 2, 2, 2, 76, 77, 3, 2, 2, 2, 77, 78, 3, 2, 2, 2, 78, 80, 9,
	3, 2, 2, 79, 81, 9, 2, 2, 2, 80, 79, 3, 2, 2, 2, 81, 82, 3, 2, 2, 2, 82,
	80, 3, 2, 2, 2, 82, 83, 3, 2, 2, 2, 83, 22, 3, 2, 2, 2, 84, 88, 7, 36,
	2, 2, 85, 87, 10, 4, 2, 2, 86, 85, 3, 2, 2, 2, 87, 90, 3, 2, 2, 2, 88,
	86, 3, 2, 2, 2, 88, 89, 3, 2, 2, 2, 89, 91, 3, 2, 2, 2, 90, 88, 3, 2, 2,
	2, 91, 92, 7, 36, 2, 2, 92, 24, 3, 2, 2, 2, 93, 94, 7, 118, 2, 2, 94, 95,
	7, 116, 2, 2, 95, 96, 7, 119, 2, 2, 96, 97, 7, 103, 2, 2, 97, 26, 3, 2,
	2, 2, 98, 99, 7, 104, 2, 2, 99, 100, 7, 99, 2, 2, 100, 101, 7, 110, 2,
	2, 101, 102, 7, 117, 2, 2, 102, 103, 7, 103, 2, 2, 103, 28, 3, 2, 2, 2,
	104, 108, 9, 5, 2, 2, 105, 107, 9, 6, 2, 2, 106, 105, 3, 2, 2, 2, 107,
	110, 3, 2, 2, 2, 108, 106, 3, 2, 2, 2, 108, 109, 3, 2, 2, 2, 109, 30, 3,
	2, 2, 2, 110, 108, 3, 2, 2, 2, 111, 113, 9, 7, 2, 2, 112, 111, 3, 2, 2,
	2, 113, 114, 3, 2, 2, 2, 114, 112, 3, 2, 2, 2, 114, 115, 3, 2, 2, 2, 115,
	116, 3, 2, 2, 2, 116, 117, 8, 16, 2, 2, 117, 32, 3, 2, 2, 2, 118, 119,
	7, 94, 2, 2, 119, 120, 9, 8, 2, 2, 120, 34, 3, 2, 2, 2, 9, 2, 71, 76, 82,
	88, 108, 114, 3, 8, 2, 2,
}

var lexerChannelNames = []string{
	"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
}

var lexerModeNames = []string{
	"DEFAULT_MODE",
}

var lexerLiteralNames = []string{
	"", "'('", "')'", "'println!'", "'i64'", "'f64'", "'&str'", "'bool'", "';'",
	"", "", "", "'true'", "'false'",
}

var lexerSymbolicNames = []string{
	"", "PARENA", "PARENC", "PRINTLN", "R_INT", "R_FLOAT", "R_STRING", "R_BOOL",
	"PTCOMA", "ENTERO", "FLOAT", "CADENA", "R_TRUE", "R_FALSE", "ID", "WHITESPACE",
}

var lexerRuleNames = []string{
	"PARENA", "PARENC", "PRINTLN", "R_INT", "R_FLOAT", "R_STRING", "R_BOOL",
	"PTCOMA", "ENTERO", "FLOAT", "CADENA", "R_TRUE", "R_FALSE", "ID", "WHITESPACE",
	"ESC_SEQ",
}

type Lexico struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

// NewLexico produces a new lexer instance for the optional input antlr.CharStream.
//
// The *Lexico instance produced may be reused by calling the SetInputStream method.
// The initial lexer configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewLexico(input antlr.CharStream) *Lexico {
	l := new(Lexico)
	lexerDeserializer := antlr.NewATNDeserializer(nil)
	lexerAtn := lexerDeserializer.DeserializeFromUInt16(serializedLexerAtn)
	lexerDecisionToDFA := make([]*antlr.DFA, len(lexerAtn.DecisionToState))
	for index, ds := range lexerAtn.DecisionToState {
		lexerDecisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	l.BaseLexer = antlr.NewBaseLexer(input)
	l.Interpreter = antlr.NewLexerATNSimulator(l, lexerAtn, lexerDecisionToDFA, antlr.NewPredictionContextCache())

	l.channelNames = lexerChannelNames
	l.modeNames = lexerModeNames
	l.RuleNames = lexerRuleNames
	l.LiteralNames = lexerLiteralNames
	l.SymbolicNames = lexerSymbolicNames
	l.GrammarFileName = "Lexico.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// Lexico tokens.
const (
	LexicoPARENA     = 1
	LexicoPARENC     = 2
	LexicoPRINTLN    = 3
	LexicoR_INT      = 4
	LexicoR_FLOAT    = 5
	LexicoR_STRING   = 6
	LexicoR_BOOL     = 7
	LexicoPTCOMA     = 8
	LexicoENTERO     = 9
	LexicoFLOAT      = 10
	LexicoCADENA     = 11
	LexicoR_TRUE     = 12
	LexicoR_FALSE    = 13
	LexicoID         = 14
	LexicoWHITESPACE = 15
)
